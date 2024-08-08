package com.learning.backend.worker.dataPopulation.parser;

import opennlp.tools.namefind.NameFinderME;
import opennlp.tools.namefind.TokenNameFinderModel;
import opennlp.tools.tokenize.Tokenizer;
import opennlp.tools.tokenize.TokenizerME;
import opennlp.tools.tokenize.TokenizerModel;
import opennlp.tools.util.Span;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

@Service
public class SimpleSkillParser {

    String jobDescription = "Azure is in the race to win it.\n" +
            "\n" +
            "Imagine being at the forefront of transformative cloud native technologies. Azure Firewall service is part of the Azure networking team responsible for designing, building, and operating network connectivity, application load balancing and security services like ExpressRoute, virtual private network (VPN), Azure Firewall, Bastion, Application Gateway Containers, Web Application Firewall, Virtual Wide-Area Network (WAN) and Virtual Network Functions platform.\n" +
            "\n" +
            " \n" +
            "\n" +
            "We are looking for a Software Engineer II to design, build and operate this service at hyper-scale.   This position is for someone seeking the challenge to design, implement, and operate large-scale distributed systems in an agile environment. This role offers you a unique opportunity to accelerate your career growth, develop a deep understanding of cloud technology.\n" +
            "\n" +
            "This team member will participate in architecture, design of various components, and ensure a timely execution of the features with high quality. You will own the component end-to-end, including testing, managing cross team dependencies as well as monitoring and alerting for the deployed component. The position will involve extensive internal and external collaborations with other Azure/Microsoft teams as well as networking vendors.\n" +
            "\n" +
            " \n" +
            "\n" +
            "Our culture promotes diversity and inclusion and is clearly reflected in all the things we do. Diversity is more than a commitment for us - it is the foundation of what we do. This is a high visibility position in an area of large and expanding investment for Azure and offers a terrific opportunity to innovate, influence, transform, and grow. We encourage you to apply to learn more! \n" +
            "\n" +
            " \n" +
            "\n" +
            "Microsoft’s mission is to empower every person and every organization on the planet to achieve more. As employees we come together with a growth mindset, innovate to empower others and collaborate to realize our shared goals. Each day we build on our values of respect, integrity, and accountability to create a culture of inclusion where everyone can thrive at work and beyond.\n" +
            "\n" +
            "In alignment with our Microsoft values, we are committed to cultivating an inclusive work environment for all employees to positively impact our culture every day.\n" +
            "\n" +
            "Responsibilities\n" +
            "\n" +
            "Works with appropriate stakeholders to determine user requirements for a set of features.\n" +
            "Contributes to the identification of dependencies, and the development of design documents for a product area with little oversight.\n" +
            "Creates and implements code for a product, service, or feature, reusing code as applicable.\n" +
            "Contributes to efforts to break down larger work items into smaller work items and provides estimation.\n" +
            "Acts as a Designated Responsible Individual (DRI) working on-call to monitor system/product feature/service for degradation, downtime, or interruptions and gains approval to restore system/product/service for simple problems.\n" +
            "Remains current in skills by investing time and effort into staying abreast of current developments that will improve the availability, reliability, efficiency, observability, and performance of products while also driving consistency in monitoring and operations at scale.\n" +
            "Embody our Culture and Values.\n" +
            "\n" +
            "Qualifications\n" +
            "\n" +
            "Required Qualifications:\n" +
            "\n" +
            "Bachelor's Degree in Computer Science or related technical field AND 2+ years technical engineering experience with coding in languages including, but not limited to, Golang, Rust, C++, C#, Java or Python.\n" +
            "OR equivalent experience.\n" +
            "2+ years experience in one or more of the following areas:\n" +
            "Networking (TCP/IP, UDP, TLS/SSL, HTTP/HTTPS)\n" +
            "Distributed Systems\n" +
            "Designing and running large-scale fault-tolerant infrastructure services\n" +
            "RESTful Services\n" +
            "Other Requirements\n" +
            "\n" +
            "Ability to meet Microsoft, customer and/or government security screening requirements are required for this role. These requirements include, but are not limited to the following specialized security screenings: \n" +
            "Microsoft Cloud Background Check: This position will be required to pass the Microsoft Cloud Background Check upon hire/transfer and every two years thereafter.\n" +
            "Preferred Qualifications\n" +
            "\n" +
            "Bachelor's Degree in Computer Science or related technical field AND 4+ years technical engineering experience with coding in languages including, but not limited to Golang, Rust, C++, C#, Java or Python.\n" +
            "OR Master's Degree in Computer Science or related technical field AND 2+ years technical engineering experience with coding in languages including, , but not limited to, Golang, Rust, C++, C#, Java or Python.\n" +
            "OR equivalent experience.\n" +
            "Experience with Kubernetes and wider Cloud native / Container ecosystem.\n" +
            "Experience with L4-L7 proxies (Nginx, Envoy, HAProxy).\n" +
            "Contribution to open-source software projects.\n" +
            "Software Engineering IC3 - The typical base pay range for this role across the U.S. is USD $94,300 - $182,600 per year. There is a different range applicable to specific work locations, within the San Francisco Bay area and New York City metropolitan area, and the base pay range for this role in those locations is USD $120,900 - $198,600 per year.\n";

    public void SimplerOpenNLPTest() throws IOException {
        try (InputStream tokenModelIn = new FileInputStream("en-token.bin");
             InputStream nerModelIn = new FileInputStream("en-ner-skill.bin")) {

            TokenizerModel tokenizerModel = new TokenizerModel(tokenModelIn);
            TokenizerME tokenizer = new TokenizerME(tokenizerModel);

            TokenNameFinderModel nerModel = new TokenNameFinderModel(nerModelIn);
            NameFinderME ner = new NameFinderME(nerModel);

            String[] tokens = tokenizer.tokenize(jobDescription);
            Span[] spans = ner.find(tokens);

            for (Span span : spans) {
                CharSequence[] tokenSeq = new CharSequence[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    tokenSeq[i] = tokens[i];
                }
                String skill = String.join(" ", Arrays.copyOfRange(tokenSeq, span.getStart(), span.getEnd()));
                System.out.println("Skill: " + skill);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

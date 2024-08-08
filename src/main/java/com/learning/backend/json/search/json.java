package com.learning.backend.json.search;

//public class json {
//    {"job": [{"company": "Team Remotely Inc", "company_url": "https://www.linkedin.com/company/team-remotely-llc", "job_title": "Junior Software Development Engineer", "job_url": "https://www.linkedin.com/jobs/view/junior-software-development-engineer-at-team-remotely-inc-3873445130", "list_date": "2024-03-27", "location": "Columbus, OH"}, {"company": "PhysicsX", "company_url": "https://www.linkedin.com/company/physicsx", "job_title": "Junior Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/junior-software-engineer-at-physicsx-3840175770", "list_date": "2024-03-01", "location": "London, England, United Kingdom"}, {"company": "Clarifai", "company_url": "https://www.linkedin.com/company/clarifai", "job_title": "Software Engineer (Junior Backend)", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-junior-backend-at-clarifai-3871750365", "list_date": "2024-03-27", "location": "Bengaluru, Karnataka, India"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer I", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-i-at-microsoft-3868952663", "list_date": "2024-03-26", "location": "Redmond, WA"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868955646", "list_date": "2024-03-26", "location": "Bengaluru, Karnataka, India"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868956031", "list_date": "2024-03-26", "location": "Bengaluru, Karnataka, India"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868950824", "list_date": "2024-03-26", "location": "Bengaluru, Karnataka, India"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868955092", "list_date": "2024-03-26", "location": "Bengaluru, Karnataka, India"}, {"company": "Vbrick", "company_url": "https://www.linkedin.com/company/vbrick", "job_title": "Software Engineer Intern", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-intern-at-vbrick-3871448170", "list_date": "2024-03-27", "location": "Herndon, VA"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer \u2013 Web", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-%E2%80%93-web-at-microsoft-3868953719", "list_date": "2024-03-26", "location": "Hyderabad, Telangana, India"}, {"company": "Peoplr, LLC", "company_url": "https://www.linkedin.com/company/peoplr-llc", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-peoplr-llc-3868989125", "list_date": "2024-03-26", "location": "Ann Arbor, MI"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868951756", "list_date": "2024-03-26", "location": "Noida, Uttar Pradesh, India"}, {"company": "Encompass Technologies", "company_url": "https://www.linkedin.com/company/encompasstechnologies", "job_title": "Full Stack Software Engineer (Jr - Mid)", "job_url": "https://www.linkedin.com/jobs/view/full-stack-software-engineer-jr-mid-at-encompass-technologies-3871489144", "list_date": "2024-03-27", "location": "Melbourne, Victoria, Australia"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868952839", "list_date": "2024-03-26", "location": "Redmond, WA"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868955538", "list_date": "2024-03-26", "location": "Mountain View, CA"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868955727", "list_date": "2024-03-26", "location": "Redmond, WA"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868956265", "list_date": "2024-03-26", "location": "Noida, Uttar Pradesh, India"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868948884", "list_date": "2024-03-26", "location": "Bengaluru, Karnataka, India"}, {"company": "Patterned Learning Career", "company_url": "https://www.linkedin.com/company/patterned-learning-career", "job_title": "Junior Web Developer", "job_url": "https://www.linkedin.com/jobs/view/junior-web-developer-at-patterned-learning-career-3873444340", "list_date": "2024-03-27", "location": "Houston, TX"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868955761", "list_date": "2024-03-26", "location": "Bengaluru, Karnataka, India"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868954460", "list_date": "2024-03-26", "location": "Redmond, WA"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868951927", "list_date": "2024-03-26", "location": "Mountain View, CA"}, {"company": "Bubble", "company_url": "https://www.linkedin.com/company/bubble-hq", "job_title": "Software Engineer II", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-ii-at-bubble-3872421019", "list_date": "2024-03-26", "location": "New York, NY"}, {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft", "job_title": "Software Engineer", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3868956490", "list_date": "2024-03-26", "location": "Redmond, WA"}, {"company": "Wayfair", "company_url": "https://www.linkedin.com/company/wayfair", "job_title": "Software Engineer I - Summer 2024", "job_url": "https://www.linkedin.com/jobs/view/software-engineer-i-summer-2024-at-wayfair-3870292029", "list_date": "2024-03-26", "location": "Austin, TX"}], "next_page_no": 1, "next_page_api_url": "https://nubela.co/proxycurl/api/v2/linkedin/company/job?pagination=eyJwYWdlIjogMSwgIm1ldGhvZCI6ICJtYnJvd3NlciJ9&keyword=software+engineer&geo_id=92000000", "previous_page_no": null, "previous_page_api_url": null}
//}


//{"job": [
// {
// "company": "Upstox",
// "company_url": "https://www.linkedin.com/company/upstox",
// "job_title": "Software Development Engineer - I (Frontend)",
// "job_url": "https://www.linkedin.com/jobs/view/software-development-engineer-i-frontend-at-upstox-3904293160",
// "list_date": "2024-04-22",
// "location": "Mumbai, Maharashtra, India"
// },
// {
// "company": "Microsoft",
// "company_url": "https://www.linkedin.com/company/microsoft",
// "job_title": "Software Engineer",
// "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3904646858",
// "list_date": "2024-04-23", "location": "Hyderabad, Telangana, India"
// },
// {"company": "Little Caesars Pizza",
// "company_url": "https://www.linkedin.com/company/little-caesars",
// "job_title": "Software Engineer (REACT)",
// "job_url": "https://www.linkedin.com/jobs/view/software-engineer-react-at-little-caesars-pizza-3904211712",
// "list_date": "2024-04-22", "location": "Detroit"},
// {"company": "Microsoft", "company_url": "https://www.linkedin.com/company/microsoft",
// "job_title": "Software Engineer",
// "job_url": "https://www.linkedin.com/jobs/view/software-engineer-at-microsoft-3903679974",
// "list_date": "2024-04-22", "location": "Hyderabad, Telangana, India"},
// {"company": "Canva", "company_url": "https://www.linkedin.com/company/canva",
// "job_title": "Graduate Software Engineer (Backend / Frontend) - ANZ",
// "job_url": "https://www.linkedin.com/jobs/view/graduate-software-engineer-backend-frontend-anz-at-canva-3904222213",
// "list_date": "2024-04-22", "location": "Auckland, Auckland, Nuova Zelanda"},
// {"company": "Engtal", "company_url": "https://www.linkedin.com/company/engtal",
// "job_title": "Entry Level Software Engineer (Remote)",
// "job_url": "https://www.linkedin.com/jobs/view/entry-level-software-engineer-remote-at-engtal-3904683706",
// "list_date": "2024-04-23", "location": "Stati Uniti d'America"},
// {"company": "HireMeFast LLC", "company_url": "https://www.linkedin.com/company/hiremefast",
// "job_title": "Junior Full Stack Software Engineer",
// "job_url": "https://www.linkedin.com/jobs/view/junior-full-stack-software-engineer-at-hiremefast-llc-3908551095",
// "list_date": "2024-04-23", "location": "Tampa, Florida, Stati Uniti d'America"},
// {"company": "Tripalink", "company_url": "https://www.linkedin.com/company/tripalink-corp",
// "job_title": "Full-stack Software Engineer",
// "job_url": "https://www.linkedin.com/jobs/view/full-stack-software-engineer-at-tripalink-3905127692",
// "list_date": "2024-04-23", "location": "Los Angeles, California, Stati Uniti d'America"},
// {"company": "Clever Inc.", "company_url": "https://www.linkedin.com/company/clever-inc-",
// "job_title": "General Applications - Software Engineer (all levels)",
// "job_url": "https://www.linkedin.com/jobs/view/general-applications-software-engineer-all-levels-at-clever-inc-3908003787",
// "list_date": "2024-04-23",
// "location": "San Francisco, California, Stati Uniti d'America"}],
// "next_page_no": 1,
// "next_page_api_url": "https://nubela.co/proxycurl/api/v2/linkedin/company/job?pagination=eyJwYWdlIjogMSwgIm1ldGhvZCI6ICJtYnJvd3NlciJ9&keyword=software+engineer&geo_id=92000000",
// "previous_page_no": null,
// "previous_page_api_url": null}
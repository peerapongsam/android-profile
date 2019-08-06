<?php

$profile = [
    'first_name' => 'Peerapong',
    'last_name' => 'Samarnpong',
    'email' => 'peerapong.sam@gmail.com',
    'tel' => '+668-5610-2461',
    'address' => '145 Inthamara 33, Din Daeng, Bangkok 10400',
    'position' => 'Android Developer',
    'about' => 'I am a passonate web and android developer',
    'experience' => [
        [
            'position' => 'Lead Mobile Application Developer',
            'company' => 'Internet Marketing Co., Ltd.',
            'location' => 'Bangkok',
            'from' => '2016-04-01',
            'responsibilities' => ''
        ],
        [
            'position' => 'Management Information System Officer',
            'company' => 'Winner Online Co., Ltd.',
            'location' => 'Bangkok',
            'form' => '2011-11-16',
            'to' => '2016-02-29',
            'responsibilities' => ''
        ]
    ],
    'education' => [
        [
            'degree' => 'Bachelor of Science (Information Tedcnology)',
            'school' => 'Ubon Ratchathani University',
            'location' => 'Ubon Ratchthani',
            'from' => '2007',
            'to' => '2018'
        ],
        [
            'degree' => 'Senior High School',
            'school' => 'Hua Taphan Wittayakhom School',
            'location' => 'Amnat Charoen',
            'from' => '2004',
            'to' => '2007'
        ],
        [
            'degree' => 'Junior High School',
            'school' => 'Borchaneng Wittaya School',
            'location' => 'Amnat Charoen',
            'from' => '2001',
            'to' => '2004'
        ]
    ],
    'site' => [
        ['type' => 'github', 'url' => 'https://github.com/peerapongsam'],
        ['type' => 'facebook', 'url' => 'https://fb.me/peerapongsam'],
    ],
    'interested' => [
        '',
        '',
        '',
        ''
    ]
];
header('Content-Type: application/json; charset=utf-8');
echo json_encode($profile);

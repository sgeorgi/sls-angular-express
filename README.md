# serverless-angular-scala

## Serverless configuration with AWS

- Be sure to install the AWS CLI V2 and invoke `aws configure sso --profile georgi-sls`
- Specify the SSO start URL as: `https://georgi-sso.awsapps.com/start#/`
- Specify region `eu-central-1`
- Follow the partly automated instructions up to the point where you have to log in
and confirm the configuration of your local AWS CLI

You now have a local AWS CLI profile named `georgi-sls` installed and your CLI is 
authenticated. You will have to reauthenticate after a day or so, issuing
`aws sso login --profile georgi-sls`

All serverless or AWS CLI commands can be prefixed with `AWS_PROFILE=georgi-sls` if
not configured directly.

Python SSO-to-credentials
- `curl https://bootstrap.pypa.io/get-pip.py -o get-pip.py`
- `python get-pip.py`
- `pip install yawsso`

Run `yawsso -p georgi-sls` after each aws sso login to get real credentials 
for the serverless-framework
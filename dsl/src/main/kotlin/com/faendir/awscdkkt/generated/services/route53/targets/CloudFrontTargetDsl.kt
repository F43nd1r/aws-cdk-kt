package com.faendir.awscdkkt.generated.services.route53.targets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.cloudfront.IDistribution
import software.amazon.awscdk.services.route53.targets.CloudFrontTarget

@Generated
public fun cloudFrontTarget(distribution: IDistribution): CloudFrontTarget =
    CloudFrontTarget(distribution)

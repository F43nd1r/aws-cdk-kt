package com.faendir.awscdkkt.generated.services.route53.targets

import javax.`annotation`.Generated
import software.amazon.awscdk.services.route53.targets.BucketWebsiteTarget
import software.amazon.awscdk.services.s3.IBucket

@Generated
public fun bucketWebsiteTarget(bucket: IBucket): BucketWebsiteTarget = BucketWebsiteTarget(bucket)

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

@Generated
public fun s3Property(initializer: CfnVerifiedAccessInstance.S3Property.Builder.() -> Unit = {}):
    CfnVerifiedAccessInstance.S3Property =
    CfnVerifiedAccessInstance.S3Property.builder().apply(initializer).build()

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessInstance

@Generated
public
    fun kinesisDataFirehoseProperty(initializer: CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.Builder.() -> Unit
    = {}): CfnVerifiedAccessInstance.KinesisDataFirehoseProperty =
    CfnVerifiedAccessInstance.KinesisDataFirehoseProperty.builder().apply(initializer).build()

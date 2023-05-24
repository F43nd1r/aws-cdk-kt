package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AmazonLinuxImage

@Generated
public fun buildAmazonLinuxImage(initializer: @AwsCdkDsl AmazonLinuxImage.Builder.() -> Unit):
    AmazonLinuxImage = AmazonLinuxImage.Builder.create().apply(initializer).build()

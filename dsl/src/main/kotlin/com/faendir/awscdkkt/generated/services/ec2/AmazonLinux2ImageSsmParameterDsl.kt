package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2ImageSsmParameterProps

@Generated
public fun amazonLinux2ImageSsmParameter(props: AmazonLinux2ImageSsmParameterProps):
    AmazonLinux2ImageSsmParameter = AmazonLinux2ImageSsmParameter(props)

@Generated
public fun buildAmazonLinux2ImageSsmParameter(initializer: @AwsCdkDsl
    AmazonLinux2ImageSsmParameter.Builder.() -> Unit): AmazonLinux2ImageSsmParameter =
    AmazonLinux2ImageSsmParameter.Builder.create().apply(initializer).build()

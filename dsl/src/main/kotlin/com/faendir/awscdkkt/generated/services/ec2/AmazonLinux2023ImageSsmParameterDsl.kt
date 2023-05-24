package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2023ImageSsmParameterProps

@Generated
public fun amazonLinux2023ImageSsmParameter(): AmazonLinux2023ImageSsmParameter =
    AmazonLinux2023ImageSsmParameter()

@Generated
public fun amazonLinux2023ImageSsmParameter(props: AmazonLinux2023ImageSsmParameterProps):
    AmazonLinux2023ImageSsmParameter = AmazonLinux2023ImageSsmParameter(props)

@Generated
public fun buildAmazonLinux2023ImageSsmParameter(initializer: @AwsCdkDsl
    AmazonLinux2023ImageSsmParameter.Builder.() -> Unit): AmazonLinux2023ImageSsmParameter =
    AmazonLinux2023ImageSsmParameter.Builder.create().apply(initializer).build()

package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameter
import software.amazon.awscdk.services.ec2.AmazonLinux2022ImageSsmParameterProps

@Generated
public fun amazonLinux2022ImageSsmParameter(props: AmazonLinux2022ImageSsmParameterProps):
    AmazonLinux2022ImageSsmParameter = AmazonLinux2022ImageSsmParameter(props)

@Generated
public fun buildAmazonLinux2022ImageSsmParameter(initializer: @AwsCdkDsl
    AmazonLinux2022ImageSsmParameter.Builder.() -> Unit): AmazonLinux2022ImageSsmParameter =
    AmazonLinux2022ImageSsmParameter.Builder.create().apply(initializer).build()

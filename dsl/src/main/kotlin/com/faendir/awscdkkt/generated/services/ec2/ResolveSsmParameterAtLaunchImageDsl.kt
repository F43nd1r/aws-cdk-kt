package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ResolveSsmParameterAtLaunchImage

@Generated
public fun buildResolveSsmParameterAtLaunchImage(parameterName: String, initializer: @AwsCdkDsl
    ResolveSsmParameterAtLaunchImage.Builder.() -> Unit): ResolveSsmParameterAtLaunchImage =
    ResolveSsmParameterAtLaunchImage.Builder.create(parameterName).apply(initializer).build()

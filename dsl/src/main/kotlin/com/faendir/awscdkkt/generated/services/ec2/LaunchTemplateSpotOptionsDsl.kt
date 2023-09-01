package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions

@Generated
public fun buildLaunchTemplateSpotOptions(initializer: @AwsCdkDsl
    LaunchTemplateSpotOptions.Builder.() -> Unit = {}): LaunchTemplateSpotOptions =
    LaunchTemplateSpotOptions.Builder().apply(initializer).build()

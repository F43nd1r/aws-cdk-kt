package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LaunchTemplateSpotOptions

@Generated
public fun launchTemplateSpotOptions(initializer: LaunchTemplateSpotOptions.Builder.() -> Unit =
    {}): LaunchTemplateSpotOptions = LaunchTemplateSpotOptions.builder().apply(initializer).build()

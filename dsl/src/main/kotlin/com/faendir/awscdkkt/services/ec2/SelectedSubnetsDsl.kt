package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SelectedSubnets

@Generated
public fun selectedSubnets(initializer: SelectedSubnets.Builder.() -> Unit = {}): SelectedSubnets =
    SelectedSubnets.builder().apply(initializer).build()

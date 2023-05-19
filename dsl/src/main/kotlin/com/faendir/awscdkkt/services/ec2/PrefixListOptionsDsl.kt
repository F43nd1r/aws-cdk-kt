@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrefixListOptions

public fun prefixListOptions(initializer: PrefixListOptions.Builder.() -> Unit): PrefixListOptions =
    PrefixListOptions.builder().apply(initializer).build()

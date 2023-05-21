package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrefixListProps

@Generated
public fun prefixListProps(initializer: PrefixListProps.Builder.() -> Unit = {}): PrefixListProps =
    PrefixListProps.builder().apply(initializer).build()

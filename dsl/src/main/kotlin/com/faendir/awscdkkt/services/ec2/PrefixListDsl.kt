package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrefixList
import software.amazon.awscdk.services.ec2.PrefixListProps
import software.constructs.Construct

@Generated
public fun Construct.prefixList(id: String, initializer: PrefixList.() -> Unit = {}): PrefixList =
    PrefixList(this, id).apply(initializer)

@Generated
public fun Construct.prefixList(
  id: String,
  props: PrefixListProps,
  initializer: PrefixList.() -> Unit = {},
): PrefixList = PrefixList(this, id, props).apply(initializer)

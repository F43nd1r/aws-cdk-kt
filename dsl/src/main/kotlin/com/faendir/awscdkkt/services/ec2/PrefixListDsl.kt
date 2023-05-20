@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrefixList
import software.amazon.awscdk.services.ec2.PrefixListProps
import software.constructs.Construct

public fun Construct.prefixList(id: String, initializer: PrefixList.() -> Unit = {}): PrefixList =
    PrefixList(this, id).apply(initializer)

public fun Construct.prefixList(
  id: String,
  props: PrefixListProps,
  initializer: PrefixList.() -> Unit = {},
): PrefixList = PrefixList(this, id, props).apply(initializer)

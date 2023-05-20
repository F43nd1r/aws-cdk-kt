@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnPrefixList
import software.amazon.awscdk.services.ec2.CfnPrefixListProps
import software.constructs.Construct

public fun Construct.cfnPrefixList(
  id: String,
  props: CfnPrefixListProps,
  initializer: CfnPrefixList.() -> Unit = {},
): CfnPrefixList = CfnPrefixList(this, id, props).apply(initializer)

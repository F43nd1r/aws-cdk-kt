@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps
import software.constructs.Construct

public fun Construct.cfnNetworkAclEntry(
  id: String,
  props: CfnNetworkAclEntryProps,
  initializer: CfnNetworkAclEntry.() -> Unit = {},
): CfnNetworkAclEntry = CfnNetworkAclEntry(this, id, props).apply(initializer)

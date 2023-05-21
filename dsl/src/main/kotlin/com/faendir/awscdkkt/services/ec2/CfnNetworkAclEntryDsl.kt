package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntry
import software.amazon.awscdk.services.ec2.CfnNetworkAclEntryProps
import software.constructs.Construct

@Generated
public fun Construct.cfnNetworkAclEntry(
  id: String,
  props: CfnNetworkAclEntryProps,
  initializer: CfnNetworkAclEntry.() -> Unit = {},
): CfnNetworkAclEntry = CfnNetworkAclEntry(this, id, props).apply(initializer)

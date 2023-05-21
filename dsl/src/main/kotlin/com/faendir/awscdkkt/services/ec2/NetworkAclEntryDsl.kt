package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.NetworkAclEntry
import software.amazon.awscdk.services.ec2.NetworkAclEntryProps
import software.constructs.Construct

@Generated
public fun Construct.networkAclEntry(
  id: String,
  props: NetworkAclEntryProps,
  initializer: NetworkAclEntry.() -> Unit = {},
): NetworkAclEntry = NetworkAclEntry(this, id, props).apply(initializer)

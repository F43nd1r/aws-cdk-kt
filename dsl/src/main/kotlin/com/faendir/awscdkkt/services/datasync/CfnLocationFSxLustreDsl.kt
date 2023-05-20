@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxLustre
import software.amazon.awscdk.services.datasync.CfnLocationFSxLustreProps
import software.constructs.Construct

public fun Construct.cfnLocationFSxLustre(
  id: String,
  props: CfnLocationFSxLustreProps,
  initializer: CfnLocationFSxLustre.() -> Unit = {},
): CfnLocationFSxLustre = CfnLocationFSxLustre(this, id, props).apply(initializer)

@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.datasync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAP
import software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps
import software.constructs.Construct

public fun Construct.cfnLocationFSxONTAP(
  id: String,
  props: CfnLocationFSxONTAPProps,
  initializer: CfnLocationFSxONTAP.() -> Unit = {},
): CfnLocationFSxONTAP = CfnLocationFSxONTAP(this, id, props).apply(initializer)

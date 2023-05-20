@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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

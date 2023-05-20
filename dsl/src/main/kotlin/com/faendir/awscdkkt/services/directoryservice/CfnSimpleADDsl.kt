@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.directoryservice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.directoryservice.CfnSimpleAD
import software.amazon.awscdk.services.directoryservice.CfnSimpleADProps
import software.constructs.Construct

public fun Construct.cfnSimpleAD(
  id: String,
  props: CfnSimpleADProps,
  initializer: CfnSimpleAD.() -> Unit = {},
): CfnSimpleAD = CfnSimpleAD(this, id, props).apply(initializer)

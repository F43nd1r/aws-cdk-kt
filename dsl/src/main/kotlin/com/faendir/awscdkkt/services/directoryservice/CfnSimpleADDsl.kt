@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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

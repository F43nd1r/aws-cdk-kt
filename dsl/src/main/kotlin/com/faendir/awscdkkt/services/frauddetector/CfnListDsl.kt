@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.frauddetector

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.frauddetector.CfnList
import software.amazon.awscdk.services.frauddetector.CfnListProps
import software.constructs.Construct

public fun Construct.cfnList(
  id: String,
  props: CfnListProps,
  initializer: CfnList.() -> Unit = {},
): CfnList = CfnList(this, id, props).apply(initializer)

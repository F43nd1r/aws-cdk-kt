@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.connect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.connect.CfnHoursOfOperation
import software.amazon.awscdk.services.connect.CfnHoursOfOperationProps
import software.constructs.Construct

public fun Construct.cfnHoursOfOperation(
  id: String,
  props: CfnHoursOfOperationProps,
  initializer: CfnHoursOfOperation.() -> Unit = {},
): CfnHoursOfOperation = CfnHoursOfOperation(this, id, props).apply(initializer)

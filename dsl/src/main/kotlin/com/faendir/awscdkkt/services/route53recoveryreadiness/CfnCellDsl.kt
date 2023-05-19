@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps
import software.constructs.Construct

public fun Construct.cfnCell(id: String, initializer: CfnCell.() -> Unit = {}): CfnCell =
    CfnCell(this, id).apply(initializer)

public fun Construct.cfnCell(
  id: String,
  props: CfnCellProps,
  initializer: CfnCell.() -> Unit = {},
): CfnCell = CfnCell(this, id, props).apply(initializer)

@file:Generated(value = ["Generated based on CDK v2.80.0"])

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

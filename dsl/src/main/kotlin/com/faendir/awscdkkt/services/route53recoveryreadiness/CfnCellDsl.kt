package com.faendir.awscdkkt.services.route53recoveryreadiness

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCell(id: String, initializer: CfnCell.() -> Unit = {}): CfnCell =
    CfnCell(this, id).apply(initializer)

@Generated
public fun Construct.cfnCell(
  id: String,
  props: CfnCellProps,
  initializer: CfnCell.() -> Unit = {},
): CfnCell = CfnCell(this, id, props).apply(initializer)

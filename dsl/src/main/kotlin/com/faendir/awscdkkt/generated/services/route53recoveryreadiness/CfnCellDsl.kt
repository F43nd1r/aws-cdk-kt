package com.faendir.awscdkkt.generated.services.route53recoveryreadiness

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCell
import software.amazon.awscdk.services.route53recoveryreadiness.CfnCellProps
import software.constructs.Construct

@Generated
public fun Construct.cfnCell(id: String, props: CfnCellProps): CfnCell = CfnCell(this, id, props)

@Generated
public fun Construct.cfnCell(
  id: String,
  props: CfnCellProps,
  initializer: @AwsCdkDsl CfnCell.() -> Unit,
): CfnCell = CfnCell(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnCell(id: String): CfnCell = CfnCell(this, id)

@Generated
public fun Construct.cfnCell(id: String, initializer: @AwsCdkDsl CfnCell.() -> Unit): CfnCell =
    CfnCell(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnCell(id: String, initializer: @AwsCdkDsl CfnCell.Builder.() -> Unit):
    CfnCell = CfnCell.Builder.create(this, id).apply(initializer).build()

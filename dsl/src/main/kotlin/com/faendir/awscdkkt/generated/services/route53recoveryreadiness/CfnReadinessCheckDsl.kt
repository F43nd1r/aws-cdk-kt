package com.faendir.awscdkkt.generated.services.route53recoveryreadiness

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheck
import software.amazon.awscdk.services.route53recoveryreadiness.CfnReadinessCheckProps
import software.constructs.Construct

@Generated
public fun Construct.cfnReadinessCheck(id: String, props: CfnReadinessCheckProps): CfnReadinessCheck
    = CfnReadinessCheck(this, id, props)

@Generated
public fun Construct.cfnReadinessCheck(
  id: String,
  props: CfnReadinessCheckProps,
  initializer: @AwsCdkDsl CfnReadinessCheck.() -> Unit,
): CfnReadinessCheck = CfnReadinessCheck(this, id, props).apply(initializer)

@Generated
public fun Construct.cfnReadinessCheck(id: String): CfnReadinessCheck = CfnReadinessCheck(this, id)

@Generated
public fun Construct.cfnReadinessCheck(id: String, initializer: @AwsCdkDsl
    CfnReadinessCheck.() -> Unit): CfnReadinessCheck = CfnReadinessCheck(this,
    id).apply(initializer)

@Generated
public fun Construct.buildCfnReadinessCheck(id: String, initializer: @AwsCdkDsl
    CfnReadinessCheck.Builder.() -> Unit): CfnReadinessCheck =
    CfnReadinessCheck.Builder.create(this, id).apply(initializer).build()

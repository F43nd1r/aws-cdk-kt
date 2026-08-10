package com.faendir.awscdkkt.generated.services.redshiftserverless

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.redshiftserverless.CfnRecoveryPoint
import software.amazon.awscdk.services.redshiftserverless.CfnRecoveryPointProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRecoveryPoint(id: String, initializer: @AwsCdkDsl CfnRecoveryPoint.() -> Unit = {}): CfnRecoveryPoint = CfnRecoveryPoint(this, id).apply(initializer)

@Generated
public fun Construct.cfnRecoveryPoint(
  id: String,
  props: CfnRecoveryPointProps,
  initializer: @AwsCdkDsl CfnRecoveryPoint.() -> Unit = {},
): CfnRecoveryPoint = CfnRecoveryPoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRecoveryPoint(id: String, initializer: @AwsCdkDsl CfnRecoveryPoint.Builder.() -> Unit = {}): CfnRecoveryPoint = CfnRecoveryPoint.Builder.create(this, id).apply(initializer).build()

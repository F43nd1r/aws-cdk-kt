package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSqlHaStandbyDetectedInstance
import software.amazon.awscdk.services.ec2.CfnSqlHaStandbyDetectedInstanceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSqlHaStandbyDetectedInstance(
  id: String,
  props: CfnSqlHaStandbyDetectedInstanceProps,
  initializer: @AwsCdkDsl CfnSqlHaStandbyDetectedInstance.() -> Unit = {},
): CfnSqlHaStandbyDetectedInstance = CfnSqlHaStandbyDetectedInstance(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSqlHaStandbyDetectedInstance(id: String, initializer: @AwsCdkDsl CfnSqlHaStandbyDetectedInstance.Builder.() -> Unit = {}): CfnSqlHaStandbyDetectedInstance = CfnSqlHaStandbyDetectedInstance.Builder.create(this, id).apply(initializer).build()

package com.faendir.awscdkkt.generated.services.securitylake

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.securitylake.CfnDataLake
import software.amazon.awscdk.services.securitylake.CfnDataLakeProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataLake(id: String, initializer: @AwsCdkDsl CfnDataLake.() -> Unit = {}): CfnDataLake = CfnDataLake(this, id).apply(initializer)

@Generated
public fun Construct.cfnDataLake(
  id: String,
  props: CfnDataLakeProps,
  initializer: @AwsCdkDsl CfnDataLake.() -> Unit = {},
): CfnDataLake = CfnDataLake(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataLake(id: String, initializer: @AwsCdkDsl CfnDataLake.Builder.() -> Unit = {}): CfnDataLake = CfnDataLake.Builder.create(this, id).apply(initializer).build()

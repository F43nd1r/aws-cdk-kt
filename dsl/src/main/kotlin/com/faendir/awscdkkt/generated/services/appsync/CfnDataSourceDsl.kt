package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.CfnDataSource
import software.amazon.awscdk.services.appsync.CfnDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDataSource(
  id: String,
  props: CfnDataSourceProps,
  initializer: @AwsCdkDsl CfnDataSource.() -> Unit = {},
): CfnDataSource = CfnDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDataSource(id: String, initializer: @AwsCdkDsl
    CfnDataSource.Builder.() -> Unit = {}): CfnDataSource = CfnDataSource.Builder.create(this,
    id).apply(initializer).build()

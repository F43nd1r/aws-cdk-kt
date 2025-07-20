package com.faendir.awscdkkt.generated.services.appsync

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appsync.NoneDataSource
import software.amazon.awscdk.services.appsync.NoneDataSourceProps
import software.constructs.Construct

@Generated
public fun Construct.noneDataSource(
  id: String,
  props: NoneDataSourceProps,
  initializer: @AwsCdkDsl NoneDataSource.() -> Unit = {},
): NoneDataSource = NoneDataSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildNoneDataSource(id: String, initializer: @AwsCdkDsl NoneDataSource.Builder.() -> Unit = {}): NoneDataSource = NoneDataSource.Builder.create(this, id).apply(initializer).build()

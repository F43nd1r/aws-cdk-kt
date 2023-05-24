package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxy
import software.amazon.awscdk.services.rds.DatabaseProxyProps
import software.constructs.Construct

@Generated
public fun Construct.databaseProxy(id: String, props: DatabaseProxyProps): DatabaseProxy =
    DatabaseProxy(this, id, props)

@Generated
public fun Construct.databaseProxy(
  id: String,
  props: DatabaseProxyProps,
  initializer: @AwsCdkDsl DatabaseProxy.() -> Unit,
): DatabaseProxy = DatabaseProxy(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseProxy(id: String, initializer: @AwsCdkDsl
    DatabaseProxy.Builder.() -> Unit): DatabaseProxy = DatabaseProxy.Builder.create(this,
    id).apply(initializer).build()

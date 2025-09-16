package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseProxyEndpoint
import software.amazon.awscdk.services.rds.DatabaseProxyEndpointProps
import software.constructs.Construct

@Generated
public fun Construct.databaseProxyEndpoint(
  id: String,
  props: DatabaseProxyEndpointProps,
  initializer: @AwsCdkDsl DatabaseProxyEndpoint.() -> Unit = {},
): DatabaseProxyEndpoint = DatabaseProxyEndpoint(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseProxyEndpoint(id: String, initializer: @AwsCdkDsl DatabaseProxyEndpoint.Builder.() -> Unit = {}): DatabaseProxyEndpoint = DatabaseProxyEndpoint.Builder.create(this, id).apply(initializer).build()

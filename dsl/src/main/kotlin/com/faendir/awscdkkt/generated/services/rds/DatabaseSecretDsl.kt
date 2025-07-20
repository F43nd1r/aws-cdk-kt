package com.faendir.awscdkkt.generated.services.rds

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseSecret
import software.amazon.awscdk.services.rds.DatabaseSecretProps
import software.constructs.Construct

@Generated
public fun Construct.databaseSecret(
  id: String,
  props: DatabaseSecretProps,
  initializer: @AwsCdkDsl DatabaseSecret.() -> Unit = {},
): DatabaseSecret = DatabaseSecret(this, id, props).apply(initializer)

@Generated
public fun Construct.buildDatabaseSecret(id: String, initializer: @AwsCdkDsl DatabaseSecret.Builder.() -> Unit = {}): DatabaseSecret = DatabaseSecret.Builder.create(this, id).apply(initializer).build()

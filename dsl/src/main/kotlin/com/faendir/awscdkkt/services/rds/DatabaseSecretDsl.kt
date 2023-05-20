@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.rds.DatabaseSecret
import software.amazon.awscdk.services.rds.DatabaseSecretProps
import software.constructs.Construct

public fun Construct.databaseSecret(
  id: String,
  props: DatabaseSecretProps,
  initializer: DatabaseSecret.() -> Unit = {},
): DatabaseSecret = DatabaseSecret(this, id, props).apply(initializer)

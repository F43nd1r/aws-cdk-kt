@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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

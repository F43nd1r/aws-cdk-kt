@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.codecommit

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codecommit.Repository
import software.amazon.awscdk.services.codecommit.RepositoryProps
import software.constructs.Construct

public fun Construct.repository(
  id: String,
  props: RepositoryProps,
  initializer: Repository.() -> Unit = {},
): Repository = Repository(this, id, props).apply(initializer)

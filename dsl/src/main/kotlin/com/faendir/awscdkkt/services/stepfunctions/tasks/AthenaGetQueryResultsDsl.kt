@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResults
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResultsProps
import software.constructs.Construct

public fun Construct.athenaGetQueryResults(
  id: String,
  props: AthenaGetQueryResultsProps,
  initializer: AthenaGetQueryResults.() -> Unit = {},
): AthenaGetQueryResults = AthenaGetQueryResults(this, id, props).apply(initializer)

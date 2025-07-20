package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResults
import software.amazon.awscdk.services.stepfunctions.tasks.AthenaGetQueryResultsProps
import software.constructs.Construct

@Generated
public fun Construct.athenaGetQueryResults(
  id: String,
  props: AthenaGetQueryResultsProps,
  initializer: @AwsCdkDsl AthenaGetQueryResults.() -> Unit = {},
): AthenaGetQueryResults = AthenaGetQueryResults(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAthenaGetQueryResults(id: String, initializer: @AwsCdkDsl AthenaGetQueryResults.Builder.() -> Unit = {}): AthenaGetQueryResults = AthenaGetQueryResults.Builder.create(this, id).apply(initializer).build()

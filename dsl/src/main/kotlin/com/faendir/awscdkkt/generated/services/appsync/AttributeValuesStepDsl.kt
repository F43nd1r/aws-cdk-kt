package com.faendir.awscdkkt.generated.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.collections.List
import software.amazon.awscdk.services.appsync.Assign
import software.amazon.awscdk.services.appsync.AttributeValuesStep

@Generated
public fun attributeValuesStep(
  attr: String,
  container: String,
  assignments: List<Assign>,
): AttributeValuesStep = AttributeValuesStep(attr, container, assignments)

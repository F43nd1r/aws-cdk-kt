package com.faendir.awscdkkt.generated.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import kotlin.collections.List
import software.amazon.awscdk.services.appsync.Assign
import software.amazon.awscdk.services.appsync.AttributeValues

@Generated
public fun attributeValues(container: String): AttributeValues = AttributeValues(container)

@Generated
public fun attributeValues(container: String, assignments: List<Assign>): AttributeValues =
    AttributeValues(container, assignments)

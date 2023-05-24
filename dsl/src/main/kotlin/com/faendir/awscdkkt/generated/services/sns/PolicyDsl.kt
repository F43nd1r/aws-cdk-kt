package com.faendir.awscdkkt.generated.services.sns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.sns.FilterOrPolicy
import software.amazon.awscdk.services.sns.Policy

@Generated
public fun policy(policyDoc: Map<String, FilterOrPolicy>): Policy = Policy(policyDoc)

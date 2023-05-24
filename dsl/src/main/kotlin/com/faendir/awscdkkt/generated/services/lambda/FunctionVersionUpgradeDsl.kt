package com.faendir.awscdkkt.generated.services.lambda

import javax.`annotation`.Generated
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.lambda.FunctionVersionUpgrade

@Generated
public fun functionVersionUpgrade(featureFlag: String): FunctionVersionUpgrade =
    FunctionVersionUpgrade(featureFlag)

@Generated
public fun functionVersionUpgrade(featureFlag: String, enabled: Boolean): FunctionVersionUpgrade =
    FunctionVersionUpgrade(featureFlag, enabled)

package com.faendir.awscdkkt.generated.services.appsync

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.appsync.FunctionRuntime
import software.amazon.awscdk.services.appsync.FunctionRuntimeFamily

@Generated
public fun functionRuntime(family: FunctionRuntimeFamily, version: String): FunctionRuntime =
    FunctionRuntime(family, version)

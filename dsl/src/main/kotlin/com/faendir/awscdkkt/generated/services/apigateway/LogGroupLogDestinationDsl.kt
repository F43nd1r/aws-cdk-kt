package com.faendir.awscdkkt.generated.services.apigateway

import javax.`annotation`.Generated
import software.amazon.awscdk.services.apigateway.LogGroupLogDestination
import software.amazon.awscdk.services.logs.ILogGroup

@Generated
public fun logGroupLogDestination(logGroup: ILogGroup): LogGroupLogDestination =
    LogGroupLogDestination(logGroup)

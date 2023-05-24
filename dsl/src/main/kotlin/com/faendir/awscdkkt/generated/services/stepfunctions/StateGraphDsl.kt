package com.faendir.awscdkkt.generated.services.stepfunctions

import javax.`annotation`.Generated
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.State
import software.amazon.awscdk.services.stepfunctions.StateGraph

@Generated
public fun stateGraph(startState: State, graphDescription: String): StateGraph =
    StateGraph(startState, graphDescription)
